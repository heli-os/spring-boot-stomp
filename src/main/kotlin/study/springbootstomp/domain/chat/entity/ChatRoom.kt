package study.springbootstomp.domain.chat.entity

data class ChatRoom(
    val name: String
) {
    val id: String
        get() = "room_$name"
}
