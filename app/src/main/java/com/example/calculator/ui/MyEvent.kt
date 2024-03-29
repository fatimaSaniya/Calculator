package com.example.calculator.ui

sealed interface MyEvent{
    object onAddClicked: MyEvent
    object onSubClicked: MyEvent
    object onMulClicked: MyEvent
    object onDivClicked: MyEvent
    object OnClearClicked: MyEvent
    data class onNum1Entered(val num1: String): MyEvent
    data class onNum2Entered(val num2: String): MyEvent
}