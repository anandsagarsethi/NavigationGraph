package com.anand.navigationgraph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //see the earlier project was jst for knowledge, now a days we will always use navigation graph

    //here, we need to create fragment files, a nvaigation garph and thats it

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //this is simple consiting 2 frags, so we are writing this much of code, bt if some project contains lots of frag, like ours contains more than 20 frags, then we


        //steps ->
        /*
        1. add navigation library and safe-args plugin
        2. Create the fragments required
        3. create the navigation grpah, add the fragments, create the directions and the arguments
        4. add the xml code to the activity file (
            <fragment
        android:id="@+id/nav_host_fragment"
        android:name="androidx.navigation.fragment.NavHostFragment"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:defaultNavHost="true"
        app:navGraph="@navigation/GRAPH_FILE_HERE" />
        )
        5. call the direction function, thats it

         */
    }
}
