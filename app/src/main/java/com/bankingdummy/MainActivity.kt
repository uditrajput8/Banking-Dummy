 package com.bankingdummy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

 class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
     }


     fun loadCustomer(view: View) {
         val intent = Intent(this, CustomerList::class.java)
         startActivity(intent)
     }
 }