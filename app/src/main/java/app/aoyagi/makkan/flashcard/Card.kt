package app.aoyagi.makkan.flashcard

class Card(
    var imageId: Int,
    var title: String,
    var content: String,
    var meaning: String,
    var likenum: Int = 0
)
