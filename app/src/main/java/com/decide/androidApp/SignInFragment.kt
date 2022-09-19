package com.decide.androidApp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_sign_up.*

class SignInFragment:Fragment(R.layout.fragment_sign_in){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        println("signInFragment Started")
        tv_account_exist.setOnClickListener {
            goToSignUpFragment()
        }
    }

    private fun goToSignUpFragment(){
        findNavController().navigate(
            SignInFragmentDirections.actionSignInFragmentToSignUpFragment()
        )
    }
}