package ru.student.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Пока выводим пример вопроса и четыре кнопки.
        // Логика викторины будет добавлена в следующих работах.
        setContentView(R.layout.activity_quiz)
    }
}
