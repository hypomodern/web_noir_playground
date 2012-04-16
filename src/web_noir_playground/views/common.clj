(ns web_noir_playground.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "web_noir_playground"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))

(defpartial site-layout [& content]
  (html5
    [:head
      [:title "Web Noir Playground"]]
    [:body
      [:div#wrapper
        content]]))
