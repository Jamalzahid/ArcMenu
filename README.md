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

and include the `com.JamalZahid.arcmenu.ArcMenuLayout` as a viewgroup (with the sub-menu's as child) in your layout. The menu (floating action button) has a margin of 16dp (customizable) added to it by default to follow the material design guidelines.
Example:

   
    <com.JamalZahid.arcmenu.ArcMenuLayout
        android:id="@+id/arcMenu"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|end"
      
       >

        <com.google.android.material.floatingactionbutton.FloatingActionButton
            android:id="@+id/fab1"
            android:layout_width="wrap_content"
            android:src="@drawable/ic_launcher_background"
            android:layout_height="wrap_content" />

        <com.google.android.material.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_alert"
            android:layout_height="wrap_content" />

        <com.google.android.material.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_info"
            android:layout_height="wrap_content" />

        <com.google.android.material.floatingactionbutton.FloatingActionButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_map"
            android:layout_height="wrap_content" />

    </com.JamalZahid.arcmenu.ArcMenuLayout>
The sub-menu's (child) can be anything. Here is an ImageButton example:

    <com.JamalZahid.arcmenu.ArcMenuLayout
        android:id="@+id/arcMenu"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|start"
        app:menu_color="@color/colorPrimaryDark"
        app:menu_radius="200dp"
        app:menu_ripple_color="@color/darker_gray"
        app:menu_scr="@drawable/ic_dialog_dialer"
        app:menu_open="arc_right">

        <ImageButton
            android:id="@+id/ib1"
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_email"
            android:layout_height="wrap_content" />

        <ImageButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_alert"
            android:layout_height="wrap_content" />

        <ImageButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_info"
            android:layout_height="wrap_content" />

        <ImageButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_map"
            android:layout_height="wrap_content" />

        <ImageButton
            android:layout_width="wrap_content"
	        android:src="@drawable/ic_dialog_dialer"
            android:layout_height="wrap_content" />

    </com.JamalZahid.arcmenu.ArcMenuLayout>

API
-------
Currently the library offers the following API's

 - `toggleMenu`: Open or close the menu depending on its current state.
 - `setRadius`: Set the radius of the arc menu.
 - `isMenuOpened`: Returns whether the menu is opened or closed.
 - `setAnimationTime`: Controls the animation time to transition the menu from close to open state and vice versa. The time is represented in milli-seconds
 - `setStateChangeListener`: Allows you to listen to the state changes of the Menu, i.e. `onMenuOpened` and `onMenuClosed` events

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