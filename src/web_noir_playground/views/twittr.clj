(ns web_noir_playground.views.twittr
  (:require [web_noir_playground.views.common :as common])
  (:use [noir.core]
        [hiccup.core :only [html]]))

(defpage [:get ["/twitter/:username"]] {:keys [username]}
  (str "Your username is " username))