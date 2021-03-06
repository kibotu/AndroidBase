# Android Base [![Build Status](https://travis-ci.org/kibotu/AndroidBase.svg)](https://travis-ci.org/kibotu/AndroidBase)  [![API](https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=15) [![Gradle Version](https://img.shields.io/badge/gradle-3.1-green.svg)](https://docs.gradle.org/current/release-notes) [![Retrolambda](https://img.shields.io/badge/java-8-green.svg)](https://github.com/evant/gradle-retrolambda) [![GitHub license](https://img.shields.io/badge/license-Apache%202-blue.svg)](https://raw.githubusercontent.com/kibotu/AndroidBase/master/LICENSE)

Base template for android applications.

### Features

- default gradle tasks:
- Standard Libraries
- default folder structure
- Application, Activity, Dialog defaults
- kotlin support
- permission entry points, e.g.: location permission
- unlocking screen on app start during debug
- logging build and device info on app start
- easy shared preferences handling
- connectivity change events
- handling of passed intent data
- timebombing old versions
- update and force update checks against latest google play
- debug menu for readme, changelog, app start, restart, build info, runtime language change
- backstack handling for fragments and debug drawer menu
- enabled multidex
- handling configuration changes
- roboelectric tests


### How to install
	
	gradle installDebug
	    
### How to use

1. Update ext.properties

2. Inherit Fragments and FragmentDialogs

       
###License
<pre>
Copyright 2016 Jan Rabe

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</pre>