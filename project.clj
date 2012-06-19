(defproject cascalog-nutch "0.0.2-SNAPSHOT"
  :description "Cascading Schemes and Cascalog helpers for Nutch sequence files."
  :dependencies [[cascalog "1.9.0"]
                 [cascalog-more-taps "0.2.1"]
                 [org.apache.nutch/nutch "1.5"]
                 [org.clojure/clojure "1.4.0"]]
  :profiles {:dev {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-cdh3u3"]]}}
  :repositories {"cloudera" "https://repository.cloudera.com/artifactory/cloudera-repos"
                 "conjars" "http://conjars.org/repo"})