(ns cascalog.nutch.core
  (:import [org.apache.hadoop.io Text]
           [org.apache.nutch.crawl CrawlDatum]
           [org.apache.nutch.parse ParseData ParseText]
           [org.apache.nutch.protocol Content])
  (:require [cascalog.more-taps :refer [hfs-wrtseqfile]]))

(defn- make-tap [path [key-type value-type] outfields & {:as opts}]
  (apply hfs-wrtseqfile path key-type value-type
         (mapcat concat (merge {:outfields outfields} opts))))

(defn crawl-datum-tap
  "Creates a tap on HDFS using the Nutch crawl datum sequence file format."
  [path & opts] (apply make-tap path [Text Content] ["?url" "?crawl-datum"] opts))

(defn content-tap
  "Creates a tap on HDFS using the Nutch content sequence file format."
  [path & opts] (apply make-tap path [Text Content] ["?url" "?content"] opts))

(defn parse-data-tap
  "Creates a tap on HDFS using the Nutch parse data sequence file format."
  [path & {:as opts}] (apply make-tap path [Text ParseData] ["?url" "?parse-data"] opts))

(defn parse-text-tap
  "Creates a tap on HDFS using the Nutch parse text sequence file format."
  [path & {:as opts}] (apply make-tap path [Text ParseText] ["?url" "?parse-text"] opts))
