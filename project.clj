(defproject cascading-nutch "0.0.1-SNAPSHOT"
  :description "Cascading Scheme for Nutch sequence files."
  :dependencies [[cascading/cascading-core "1.2.4"
                  :exclusions [org.codehaus.janino/janino
                               thirdparty/jgrapht-jdk1.6
                               riffle/riffle]]
                 [org.apache.nutch/nutch "1.4"]
                 [org.clojure/clojure "1.3.0"]])