package com.decide_career.decide_app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_sign_up.*

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_account_exist.setOnClickListener {
            goToSignUpFragment()
        }
    }

    private fun goToSignUpFragment() {
        findNavController().navigate(
            SignUpFragmentDirections.actionSignUpFragmentToSignInFragment()
        )
    }


}