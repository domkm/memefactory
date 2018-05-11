(ns memefactory.styles.core
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [px]]
            [memefactory.styles.app-layout :as app-layout]
            [memefactory.styles.component.app-bar :as app-bar]
            [memefactory.styles.app-menu :as app-menu]))

(defstyles main
  app-layout/core
  app-menu/core
  app-bar/core)