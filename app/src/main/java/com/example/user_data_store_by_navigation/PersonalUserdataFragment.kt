package com.example.user_data_store_by_navigation

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.user_data_store_by_navigation.databinding.FragmentPersonalUserdataBinding


class PersonalUserdataFragment : Fragment() {

    private lateinit var binding: FragmentPersonalUserdataBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPersonalUserdataBinding.inflate(inflater, container, false)



        binding.apply {

            btnNextUserpersonal.setOnClickListener {

                if (TextUtils.isEmpty(etName.text.toString())||TextUtils.isEmpty(etEmailAddress.text.toString())||TextUtils.isEmpty(etAddress.text.toString())||TextUtils.isEmpty(etPhoneNumber.text.toString())) {

                    Toast.makeText(context,"Must be filled",Toast.LENGTH_SHORT).show()
                }
                else{

                    navController.navigate(R.id.action_personalUserdataFragment_to_userEducationFragment)

                }
            }

        }
        return binding.root
    }

}