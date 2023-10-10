# ArcMenu
[![](https://jitpack.io/v/Jamalzahid/ArcMenu.svg)](https://jitpack.io/#Jamalzahid/ArcMenu)

 ArcMenu
=================

An android custom view which allows you to have a arc style-menu on your pages and adheres to the material design specifications.

It inserts a FAB menu on the bottom left or bottom right of the screen and allows you to control the menu options.

It also implements the CoordinatorLayout Behaviour to work with Snackbar.

Change-logs
-------
Check out the [Release Notes](https://github.com/Jamalzahid/ArcMenu/releases "Releases") for the change-logs in each release.

Demo
-------
![Arc Menu](https://raw.githubusercontent.com/saurabharora90/MaterialArcMenu/develop/assets/show_menu.gif)

![Snackbar support](https://raw.githubusercontent.com/saurabharora90/MaterialArcMenu/develop/assets/snackbar.gif)

Usage
-------
Add a dependency to your `build.gradle`:
    
    repositories{
        maven { url 'https://jitpack.io' }
    }
    dependencies {
    implementation 'com.github.Jamalzahid:ArcMenu:1.0.1'
    }

# Usage
## Basic
```java
arcMenu = new ArcMenu.Builder(activity)
        .setId(ARC_MENU_ID_1)
        .addBtn(R.drawable.a, id1)
        .addBtn(R.drawable.b, id2)
        .setListener(listener)
        .showOnTouch(btn2)
        .hideOnTouchUp(false)
        .build();
```

## More things

![Desc](https://github.com/Jamalzahid/ArcMenu/blob/main/Arcmenu/1.png)

```java
arcMenu = new ArcMenu.Builder(activity)
        .addBtns(new ArcButton.Builder(menuBtn, 2),
                new ArcButton.Builder(new SimpleCirView(this)
                        .setText("2")
                        .setCirColor(Color.parseColor("#03A9F4"))
                        .setTextColor(Color.WHITE)
                        .setTextSizeInSp(22)
                        .setBackgroundRadiusInPx(22),
                        3))
        .setListener(MainActivity.this)
        .showOnLongClick(btn1)
        .setDegree(160)
        .setRadius(222)
        .build();
        
arcMenu.showOn(view); //Show Manually
```

API
-------
Currently the library offers the following API's

 - `toggleMenu`: Open or close the menu depending on its current state.
 - `setRadius`: Set the radius of the arc menu.
 - `isMenuOpened`: Returns whether the menu is opened or closed.
 - `setAnimationTime`: Controls the animation time to transition the menu from close to open state and vice versa. The time is represented in milli-seconds
 - `setStateChangeListener`: Allows you to listen to the state changes of the Menu, i.e. `onMenuOpened` and `onMenuClosed` events
 - `ArcMenu.OnClickMenuListener`:Allows you to listen to the click on specific button

License
-------

    Copyright 2019 Saurabh Arora

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.