package com.express.android.gameviewmvvm.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * ViewModel for the final screen showing the score
 */
class ScoreViewModel(finalScore: Int) : ViewModel() {

    // The final score
    var score = finalScore

    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}