(ns cascalog.nutch.core
  (:import [cascalog.nutch ContentScheme ParseDataScheme ParseTextScheme])
  (:use [cascalog.tap :only (hfs-tap)]))

(defn content-tap
  "Creates a tap on HDFS using the Nutch content sequence file format."
  [path & opts] (apply hfs-tap (ContentScheme.) path opts))

(defn parse-data-tap
  "Creates a tap on HDFS using the Nutch parse data sequence file format."
  [path & opts] (apply hfs-tap (ParseDataScheme.) path opts))

(defn parse-text-tap
  "Creates a tap on HDFS using the Nutch parse text sequence file format."
  [path & opts] (apply hfs-tap (ParseTextScheme.) path opts))
