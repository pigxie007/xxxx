
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import say_hi

class MainTest {
	@Test
	fun `test say_hi`() {
		assertEquals("Hi, user", say_hi("user"))
	}
}
