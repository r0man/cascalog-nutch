(defproject cascalog-nutch "0.0.1-SNAPSHOT"
  :description "Cascading Schemes and Cascalog helpers for Nutch sequence files."
  :dependencies [[cascalog "1.8.6"]
                 [org.apache.nutch/nutch "1.5"]
                 [org.clojure/clojure "1.4.0"]]
  :profiles {:dev {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-cdh3u3"]]}}
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :javac-options {:target "1.6"})