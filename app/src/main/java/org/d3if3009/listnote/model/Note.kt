package org.d3if3009.listnote.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.d3if3009.listnote.ui.theme.BabyBlue
import org.d3if3009.listnote.ui.theme.LightGreen
import org.d3if3009.listnote.ui.theme.RedOrange
import org.d3if3009.listnote.ui.theme.RedPink
import org.d3if3009.listnote.ui.theme.Violet


@Entity
data class Note(
  val title : String,
  val content: String,
  val timestamp: Long,
  val color: Int,
  @PrimaryKey val id: Int? = null
){
    companion object{
      val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message:String): Exception(message)
