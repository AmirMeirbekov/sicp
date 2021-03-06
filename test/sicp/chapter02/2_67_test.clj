(ns sicp.chapter02.2-67-test
  (:require [clojure.test :refer [deftest]]
            [sicp.chapter02.2-67 :as sicp-2-67]
            [sicp.test-helper :refer [assert-equal]]))

(def sample-tree
  (->> (sicp-2-67/make-leaf 'C 1)
       (sicp-2-67/make-code-tree (sicp-2-67/make-leaf 'D 1))
       (sicp-2-67/make-code-tree (sicp-2-67/make-leaf 'B 2))
       (sicp-2-67/make-code-tree (sicp-2-67/make-leaf 'A 4))))

(deftest test-decode
  (let [sample-message '(0 1 1 0 0 1 0 1 0 1 1 1 0)]
    (assert-equal '(A D A B B C A) (sicp-2-67/decode sample-message sample-tree))))
