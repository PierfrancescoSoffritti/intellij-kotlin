// "Replace with default Json format instance" "true"
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.json.Json as Alias

fun foo() {
    <caret>Alias {}
}
