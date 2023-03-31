package vinits.localMavenFirstLibTest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import vinit.localMavenFirstLib.LocalMavenFirstLibInfo
import vinits.localMavenFirstLibTest.databinding.ActivityMainBinding

class LocalMavenFirstLibTestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewOne.text = LocalMavenFirstLibInfo.getLocalMavenFirstLibInfo()

    }
}