package za.ac.iie.st10445005.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

        private var infoOfDeadPeople = arrayOf(
                "MIchael Jackson was a gifted singer and dancer who had a successful solo and Jackson 5 career that peaked at the top of the charts",
                "Kobe Bryant, a former professional basketball player, became one of the game's all-time greats and won five NBA titles with the Los Angeles Lakers. On January 26, 2020, he perished tragically in a helicopter crash",
                "The renowned hip-hop artist Biggie Smalls, often known as 'The Notorious B.I.G.,' was the face of East Coast gangsta rap. On March 9, 1997, he was shot and died",
                "The first four albums by American singer-actress Whitney Houston were released between 1985 and 1992, and they sold over 86 million copies worldwide",
                "Bruce Lee was a highly regarded actor, director, and martial artist who popularised Jeet Kune Do and appeared in films such as Enter the Dragon and Fists of Fury ",
                "American actor Chadwick Boseman gained notoriety for his roles as James Brown in 'Get on Up' and Jackie Robinson in '42. 'In the Marvel Cinematic Universe, he also portrayed the superhero Black Panther,",
                "One of the most well-known figures in rock 'n' roll history, Elvis Presley is a musician and actor who first gained popularity in the middle of the 1950s on radio, television, and the big screen",
                "From 1994 until 2000, actor Matthew Perry was most known for his role as Chandler Bing on the popular comedy Friends",
                "Muhammad Ali had an outstanding 56-win record as a heavyweight boxer and was a three-time champion. He was well-known for opposing the Vietnam War in public",
                "American actor Paul Walker rose to popularity in films like 'Varsity Blues' and gained widespread recognition for his lead part in the 'The Fast and the Furious' trilogy",
        )

        private var ages = arrayOf(
                50,
                41,
                24,
                48,
                32,
                43,
                42,
                54,
                74,
                40,
        )

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val btnClear = findViewById<Button>(R.id.clearButton)
                val btnGenerate = findViewById<Button>(R.id.generatehistoryButton)

                val txtAge = findViewById<EditText>(R.id.editTextNumber)
                val txtHistory = findViewById<TextView>(R.id.resultTextView)

                btnGenerate.setOnClickListener {
                        val enteredAge = txtAge.text.toString().toIntOrNull()
                        if (enteredAge != null && enteredAge in 20..100) {
                                val index = ages.indexOf(enteredAge)
                                if (index != -1) {
                                        txtHistory.text = "The person who died at the age of $enteredAge was:\n${infoOfDeadPeople[index]}"
                                } else {
                                        txtHistory.text = "No person died at the age of $enteredAge."
                                }
                        } else {
                                txtHistory.text = "The age you have entered is invalid. Please enter an age between 20 and 100."
                        }
                }

                btnClear.setOnClickListener {
                        txtAge.text.clear()
                        txtHistory.text = ""
                }
        }
}
