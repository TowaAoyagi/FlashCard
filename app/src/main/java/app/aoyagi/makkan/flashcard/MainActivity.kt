package app.aoyagi.makkan.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mCards : ArrayList<Card> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCardAdapter :CardAdapter?

        register(R.drawable.fire,R.string.fire_title,R.string.fire_content,R.string.fire_meaning)
        register(R.drawable.samurai,R.string.samurai_title,R.string.samurai_content,R.string.samurai_meaning)
        register(R.drawable.piero,R.string.piero_title,R.string.piero_content,R.string.piero_meaning)
        register(R.drawable.pregident,R.string.pregident_title,R.string.pregident_content,R.string.pregident_meaning)

        mCardAdapter = CardAdapter(this,R.layout.card,mCards)
        listView.adapter = mCardAdapter

    }

    private fun register (name:Int, title:Int, content:Int, meaning:Int){
        mCards.add(
            Card(name,
                getString(title),
                getString(content),
                getString(meaning)))
    }
}
