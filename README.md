# SpannableKtx
A simple set of Kotlin extension functions to make dealing with spannable strings just a little easier

### Specs
[![](https://jitpack.io/v/cren90/SpannableKtx.svg)](https://jitpack.io/#cren90/SpannableKtx) [![API](https://img.shields.io/badge/API-23%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=23) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# Download

This library is available in **jitpack**

## Gradle
In project level gradle file add 
```gradle
allprojects {
 repositories {
    maven { url "https://jitpack.io" }
 }
}
```
 
```gradle
dependencies {
    // other dependencies here
    
	        implementation 'com.github.cren90:spannablektx:<version>'
	}
```

# Usage
We recommend you to **check the sample app** to get a complete understanding of the library. The step-by-step implementation guide is as follows.

```kotlin
        textSample.setText(spannable { bold(italic(underline("Some bold, italic, underlined text"))) + sub(color(Color.RED, "red subscript")) }, TextView.BufferType.SPANNABLE)
```

And that's it! You'll be able to make all of your spannable strings look just the way you want them!

<img src="https://github.com/cren90/SpannableKtx/blob/master/screens/sample.png" alt="drawing" width="200"/>

#Options
All options are embeddable!

```text
bold             bolds the text, takes either a CharSequence or a Spannable String
italic           italicizes the text, takes either a CharSequence or a Spannable String
underline        underlines the text, takes either a CharSequence or a Spannable String
strike           strikethroughs the text, takes either a CharSequence or a Spannable String
sup              superscripts the text, takes either a CharSequence or a Spannable String
sub              subscripts the text, takes either a CharSequence or a Spannable String
size             sets the text size, takes either a CharSequence or a Spannable String
color            sets the text color, takes either a CharSequence or a Spannable String
background       sets the text background color, takes a color Int and either a CharSequence or a Spannable String
url              sets the text style to url, takes either a CharSequence or a Spannable String
normal           sets the text style to normal, takes either a CharSequence or a Spannable String
```
Concatenation is done using the ```+``` operator

# About the author

### Chris Renfrow
Android developer, Scrum Master

<a href='https://www.linkedin.com/in/crenfrow90?trk=profile-badge'><img src="https://github.com/cren90/icons/blob/master/linkedin.png" width="75" alt="Profile for Chris Renfrow on LinkedIn"></a> <a href="https://stackexchange.com/users/1000035"><img src="https://github.com/cren90/icons/blob/master/stackoverflow.png" width="75" alt="profile for cren90 on Stack Exchange, a network of free, community-driven Q&amp;A sites"></a> <a href="https://www.scrumalliance.org/community/profile/crenfrow2"><img src="https://github.com/cren90/icons/blob/master/seal-csm.png" width="75" alt="Profile for Chris Renfrow on Scrum Alliance Community."></a>

# Contribution

If you find a bug or would like to improve any aspect of it, feel free to contribute with pull requests.

# License

```
Copyright 2020 cren90

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


<script type="text/javascript" src="https://platform.linkedin.com/badges/js/profile.js" async defer></script>