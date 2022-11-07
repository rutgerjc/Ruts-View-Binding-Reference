package com.runitrut.rutsviewbindingreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.runitrut.rutsviewbindingreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //TODO SECOND step, NOW that viewbinding is enabled. We create a var NAMED --> "binding" <--this
    // is THE CONVENTION */
    /* Build binding here like so : EXAMPLE BELOEW
    private lateinit var binding: ActivityMainBinding
    /* ^^^^^^^^^^^ SECOND STEP ^^^^^^^^^^^^^^^^^^^^^^^*/
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* OR building the binding VAR here, like so : EXAMPLE BELOW */
        val binding = ActivityMainBinding.inflate(layoutInflater)
        /* ^^^^^^^^^^^ CONDITIONAL SECOND STEP ^^^^^^^^^^^^^^^^^^^^^^^*/

        //TODO THIRD step, setContentView() and add "binding.root"setContentView(binding.root)
        setContentView(binding.root)
        /* ^^^^^^^^ THIRD STEP ^^^^^^^^^^^^^*/

        //TODO FOURTH, and final step. Now that viewbinding is ENABLE, AND you've created a binding variable called: "binding" -
        // that extends the current class youre trying to use V.B. on
        // The CURRENT Activity is now ASSOCIATED WITH ITS CORRESPONDING XML FILE.
        // Call bind.W/E viewID you need access to
        //  =^)    */
        binding.btnView1.setOnClickListener{
            binding.textView1.text = "Viewbinding Replaces findviewbyID"
            binding.textView2.text = " OH that's cool and efficeint!"
        }
        /* ^^^^^^^^^^^ FOURTH STEP ^^^^^^^^^^^^^^^^^^^^^^^*/
    }
}