;; Copyright (c) James Reeves. All rights reserved.
;; The use and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) which
;; can be found in the file epl-v10.html at the root of this distribution. By
;; using this software in any fashion, you are agreeing to be bound by the
;; terms of this license. You must not remove this notice, or any other, from
;; this software.

(ns hiccup.core
  "Dynamically generates HTML from a Clojure data structure."
  (:use hiccup.compiler))

(defmacro html
  "Render Clojure data structures to a string of HTML."
  [& content]
  (collapse-strs `(str ~@(compile-html content))))