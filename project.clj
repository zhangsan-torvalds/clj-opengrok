(defproject clj-opengrok "0.4.0"
  :description "command line interface for OpenGrok"
  :url "https://github.com/youngker/clj-opengrok"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [lein-localrepo "0.5.3"]
                 [cli4clj "1.2.0"]
                 [org.apache.ant/ant "1.8.4"]
                 [org.apache.bcel/bcel "5.2"]
                 [org.clojure/tools.cli "0.3.5"]
                 [org.opensolaris/opengrok "0.12.1.5"]
                 [org.apache.commons/jrcs "0.12.1.5"]
                 [org.apache.lucene/lucene-core "4.7.0"]
                 [org.apache.lucene/lucene-queryparser "4.7.0"]
                 [org.apache.lucene/lucene-analyzers-common "4.7.0"]
                 [org.apache.lucene/lucene-highlighter "4.7.0"]]
  :global-vars {*warn-on-reflection* true}
  :aot [clj-opengrok.search
        clj-opengrok.index]
  :main clj-opengrok.search)
