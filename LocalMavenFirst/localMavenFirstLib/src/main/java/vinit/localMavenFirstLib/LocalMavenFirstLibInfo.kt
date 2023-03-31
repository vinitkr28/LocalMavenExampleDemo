package vinit.localMavenFirstLib

import android.os.Build
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class LocalMavenFirstLibInfo {
    companion object {
        fun getLocalMavenFirstLibInfo() = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val current = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm:ss")
            val myDate: String =  current.format(formatter)
            "From localMavenFirstLib:> $myDate"
        } else {
            val date = Date()
            val formatter = SimpleDateFormat("MMM dd yyyy HH:mma", Locale.getDefault())
            val myDate: String = formatter.format(date)
            "From localMavenFirstLib:> \n\n$myDate"
        }
    }
}