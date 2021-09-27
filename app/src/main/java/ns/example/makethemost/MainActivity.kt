package ns.example.makethemost

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout


class MainActivity : AppCompatActivity() {

    val viewModel = MainViewModel()

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContent {
//            MainContentCompose(onGoClicked(), onDoneClicked())
//        }
//    }

//    private fun onGoClicked(): () -> Unit = {
//        when {
//            viewModel.currentScore.value == null -> {
//                viewModel.getFirstScore()
//            }
//            viewModel.secondScore.value == null -> {
//                viewModel.getSecondScore()
//            }
//        }
//    }
//
//    private fun onDoneClicked(): () -> Unit = {
//        viewModel.reset()
//    }

//    @Composable
//    fun MainContentCompose(onGoClicked: () -> Unit = { },
//                           onDoneClicked: () -> Unit = { }) {
//        val firstScore = viewModel.firstScore.observeAsState()
//        val secondScore = viewModel.secondScore.observeAsState()
//        val currentScore = viewModel.currentScore.observeAsState()
//
//        ConstraintLayout(modifier = Modifier.fillMaxSize()) {
//            val (title, result, buttonGo, buttonHistory, buttonDone) = createRefs()
//            Text(text = when {
//                firstScore.value != null  && secondScore.value == null -> "YOU GOT ${ firstScore.value }"
//                secondScore.value != null -> "YOU GOT ${ secondScore.value }"
//                else -> "MAKE THE MOST"
//            },
//                color = Color.Black,
//                fontSize = 32.sp,
//                modifier = Modifier.constrainAs(title) {
//                    top.linkTo(parent.top, margin = 48.dp)
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                }
//            )
//
//            Text(text = currentScore.value?.toString() ?: "0",
//                fontSize = 100.sp,
//                modifier = Modifier.constrainAs(result) {
//                    top.linkTo(title.bottom, margin = 48.dp)
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                })
//
//            if (secondScore.value == null) {
//                ExtendedFloatingActionButton(onClick = onGoClicked,
//                    backgroundColor = Color(0xFFED964C),
//                    text = { Text(text = if (currentScore.value == null) "GO" else "MORE",
//                        color = Color.White,
//                        fontSize = 24.sp,
//                        modifier = Modifier.padding(start = 48.dp, end = 48.dp, top = 8.dp, bottom = 8.dp)) },
//                    modifier = Modifier.constrainAs(buttonGo) {
//                        top.linkTo(result.bottom, margin = 80.dp)
//                        start.linkTo(parent.start)
//                        end.linkTo(parent.end)
//                    })
//            }
//
//            if (secondScore.value != null) {
//                ExtendedFloatingActionButton(onClick = onDoneClicked,
//                    backgroundColor = Color.Red,
//                    text = { Text(text = "DONE",
//                        color = Color.White,
//                        fontSize = 24.sp,
//                        modifier = Modifier.padding(start = 48.dp, end = 48.dp, top = 8.dp, bottom = 8.dp)) },
//                    modifier = Modifier.constrainAs(buttonGo) {
//                        top.linkTo(result.bottom, margin = 80.dp)
//                        start.linkTo(parent.start)
//                        end.linkTo(parent.end)
//                    })
//            }
//        }
//    }

//    @Preview(showSystemUi = true)
//    @Composable
//    fun PreviewTest() {
//        MainContentCompose()
//    }
}