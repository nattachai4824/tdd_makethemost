package ns.example.makethemost
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import androidx.test.filters.MediumTest
import ns.example.makethemost.helper.ScoreHelper
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*
import org.junit.FixMethodOrder
import org.junit.runners.JUnit4
import org.junit.runners.MethodSorters
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
@MediumTest
class MainViewModelTest {

//    @Mock
//    lateinit var firstScoreObserver: Observer<Int?>
//
//    @Mock
//    lateinit var secondScoreObserver: Observer<Int?>
//
//    @Mock
//    lateinit var currentScoreObserver: Observer<Int?>
//
//    lateinit var viewModel: MainViewModel
//
//    @get:Rule
//    val instantExecutorRule = InstantTaskExecutorRule()
//
//    @Before
//    fun init() {
//        MockitoAnnotations.initMocks(this)
//        viewModel = MainViewModel()
//        viewModel.firstScore.observeForever(firstScoreObserver)
//        viewModel.secondScore.observeForever(secondScoreObserver)
//        viewModel.currentScore.observeForever(currentScoreObserver)
//    }
//
//    @Test
//    fun test_init() {
//        assert(viewModel.firstScore.hasObservers())
//        assert(viewModel.secondScore.hasObservers())
//        assert(viewModel.currentScore.hasObservers())
//
//        assertNull(viewModel.firstScore.value)
//        assertNull(viewModel.secondScore.value)
//        assertNull(viewModel.currentScore.value)
//    }
//
//    @Test
//    fun test_first_score() {
//        viewModel.getFirstScore()
//
//        assertNotNull(viewModel.firstScore.value)
//        assertNotNull(viewModel.currentScore)
//        verify(currentScoreObserver).onChanged(viewModel.firstScore.value)
//
//        assertNull(viewModel.secondScore.value)
//    }
//
//    @Test
//    fun test_second_score() {
//        viewModel.getFirstScore()
//        viewModel.getSecondScore()
//
//        assertNotNull(viewModel.firstScore.value)
//        assertNotNull(viewModel.secondScore.value)
//        assertNotNull(viewModel.currentScore.value)
//
//        val score = ScoreHelper.calculate(viewModel.firstScore.value!!, viewModel.secondScore.value!!)
//        verify(currentScoreObserver).onChanged(score)
//    }
}