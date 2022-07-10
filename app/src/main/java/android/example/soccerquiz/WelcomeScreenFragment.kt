package android.example.soccerquiz

import android.example.soccerquiz.databinding.FragmentWelcomeScreenBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass/
 */
class WelcomeScreenFragment: Fragment(){

    override fun onCreateView(

        inflater: LayoutInflater,container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        // Inflate the layout for this fragment
     val binding: FragmentWelcomeScreenBinding = DataBindingUtil.inflate(
         inflater, R.layout.fragment_welcome_screen, container, false
     )
        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Quiz"
        binding.letsPlayButton.setOnClickListener { view: View-> Navigation.findNavController(view).navigate(R.id.action_welcomeScreenFragment2_to_quizFragment) }



        return binding.root
    }
}