package ru.starksoft.differ.adapter

import androidx.recyclerview.widget.ListUpdateCallback
import ru.starksoft.differ.adapter.viewmodel.ViewModel

interface DifferAdapterEventListener : ListUpdateCallback {

	fun onFinished(viewModelList: List<ViewModel>)
}
