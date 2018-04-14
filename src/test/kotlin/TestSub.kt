import junit.framework.Assert.assertEquals
import org.junit.Test
import main.epl.*
import com.winterbe.expekt.expect
import com.winterbe.expekt.should
//import org.junit.Before

class TesteSub{

    @Test
    fun `return String (100 - 200) when we call Sub and print()` () {

        val eval = Eval()
        var lit1 = Literal(100)
        var lit2 = Literal(200)
        val sub = Sub(lit1, lit2)

        // Teste usando junit
        assertEquals("(100  200)", sub.accept(eval))
    }

    @Test
    fun `return 300 when we call eval result()` () {

        var lit1 = Literal(100)
        var lit2 = Literal(200)

        val eval = Eval()
        val sub = Sub(lit1,lit2)

        sub.accept(eval)

        // Teste usando expekt should
        eval.result() .should.equal(300)

    }

}