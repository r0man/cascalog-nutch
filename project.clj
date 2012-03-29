(defproject cascalog-nutch "0.0.1-SNAPSHOT"
  :description "Cascading Schemes and Cascalog helpers for Nutch sequence files."
  :dependencies [[cascalog "1.8.6"]
                 [org.apache.nutch/nutch "1.4"]
                 [org.clojure/clojure "1.3.0"]]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]]
  :source-path "src/clj"
  :java-source-path "src/jvm"
  :javac-options {:target "1.6"})