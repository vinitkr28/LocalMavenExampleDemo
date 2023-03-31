package vinit.localMavenSecondLib

import android.os.Build
import vinit.localMavenFirstLib.LocalMavenFirstLibInfo
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class LocalMavenSecondLibInfo {
    companion object {
        fun getLocalMavenSecondLibInfo() = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val current = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm:ss")
            val myDate: String =  current.format(formatter)
            "From localMavenSecondLib:> $myDate"
        } else {
            val date = Date()
            val formatter = SimpleDateFormat("MMM dd yyyy HH:mma", Locale.getDefault())
            val myDate: String = formatter.format(date)
            "From localMavenSecondLib:> \n\n$myDate"
        }

        fun getLocalMavenFirstLibInfoIntoLocalMavenSecondLibInfo() = LocalMavenFirstLibInfo.getLocalMavenFirstLibInfo()
    }
}