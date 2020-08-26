# External Merge Sort
A simple command line program for sorting large data sets stored in the [CSV file format](https://en.wikipedia.org/wiki/Comma-separated_values) through the use of an external sorting algorithm.

## Description
External sorting algorithms are a class of sorting algorithms that are capable of handling vast amounts of data, for example large data sets. Such algorithms are required when the data to be sorted does not fit into the main memory and, instead, they must reside in the slower external memory. A 2-way [external merge sort](https://en.wikipedia.org/wiki/External_sorting#External_merge_sort) was chosen to sort these large data sets.

The algorithm works as follows:

1. **Splitting of file into sorted runs**\
A maximum of n rows are read from the input file and are inserted into a priority queue which sorts each row as it is inserted. This is achieved through the use of a comparator that compares rows based on a specified field. The sorted run of rows is then extracted and written into a temporary 'split' file.

2. **Iterative merging of the sorted runs**\
The sorted runs are then iteratively merged, using a 2-way merge, until the last pair-wise merge is used to produce the sorted output file.

## Usage
To begin sorting large data sets, simply, compile and run the program from the command line and specify the following command line arguments:
```
  sort <source file> <output file> <column name>
```
