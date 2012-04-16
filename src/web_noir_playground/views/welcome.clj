(ns web_noir_playground.views.welcome
  (:require [web_noir_playground.views.common :as common])
  (:use [noir.core]
        [hiccup.core :only [html]]))

(defpartial link-item [{:keys [title path]}]
    [:li {:class "link"}
        [:a {:href path} title]])

(defpartial link-list [items]
    [:ul#links
        (map link-item items)])

(defpage "/" []
  (let [items [{:title "my-page"
                :path "/my-page"}
               {:title "twitter"
                :path "/twitter/hypomodern"}]]
    (common/site-layout
      [:h1 "Web Noir Playground"]
      (link-list items))))

(defpage "/my-page" []
  (common/site-layout
    [:h1 "Welcome to the site!"]
    [:p "I hope you like it!"]))
