package org.d3if3009.listnote.utils

sealed class OrderType{
    object Ascending : OrderType()
    object Descending : OrderType()
}
