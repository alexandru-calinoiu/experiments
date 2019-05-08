import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

@UseExperimental(FlowPreview::class)
suspend fun main(args: Array<String>) {
    ints
        .map { it * 2 }
        .collect { print(it) }
}

@UseExperimental(FlowPreview::class)
val ints: Flow<Int> = flow {
    for (i in 1..10) {
        delay(100)
        emit(i)
    }
}
