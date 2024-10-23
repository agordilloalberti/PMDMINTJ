import java.math.BigDecimal
import java.math.RoundingMode
import java.util.Scanner

class Ayudas {
    companion object {
        val sc = Scanner(System.`in`)
        fun round(num: Double, dec: Int): Double {
            return BigDecimal(num).setScale(dec, RoundingMode.HALF_EVEN).toDouble()
        }
    }
}