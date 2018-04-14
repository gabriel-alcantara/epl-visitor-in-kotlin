import org.junit.Test
import main.epl.*
import com.winterbe.expekt.should

class TesteHeight{

    @Test
    fun `return 2 when we call height from add 100+200` () {

        val eval = Eval()
        var lit1 = Literal(100)
        var lit2 = Literal(200)
        val add = Add(lit1, lit2)
        add.accept(eval)
        eval.height() .should.equal(2)
    }

}