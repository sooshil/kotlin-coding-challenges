package com.igorwojda.list.binarysearch

// Time complexity:
// Worst-case performance: O(log n)
// Best-case performance: O(1)
// Average performance: O(log n)
private object Solution {
    private fun binarySearch(list: List<Char>, element: Char): Int {
        var left = 0
        var right = list.size - 1

        while (left <= right) {
            val middle = (right + left) / 2

            // Check if x is present at mid
            if (list[middle] == element)
                return middle

            if (list[middle] < element)
                left = middle + 1 // x greater than middle, so ignore left half
            else
                right = middle - 1 // x greater than middle, so , ignore right half
        }

        // if we reach here, then element was
        // not present
        return -1
    }
}

object KtLintWillNotComplain