package vinit.localMavenSecondLibTest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import vinit.localMavenSecondLib.LocalMavenSecondLibInfo
import vinit.localMavenSecondLibTest.databinding.ActivityMainBinding

class LocalMavenSecondLibTestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewOne.text = LocalMavenSecondLibInfo.getLocalMavenFirstLibInfoIntoLocalMavenSecondLibInfo()

        binding.textViewTwo.text = LocalMavenSecondLibInfo.getLocalMavenSecondLibInfo()
    }
}