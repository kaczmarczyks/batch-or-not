# batch-or-not
simple benchmark how batch_size option affects insert execution time with hibernate


## run
mvn test

execution times will be listed in logs


## test results

TEST NAME (100000 inserts each)                 |     T[ms] 
batching_save_with_no_flush_nor_clear_test took |	  5023 
batching_save_with_no_flush_nor_clear_test took |	  2398 
batching_save_with_no_flush_nor_clear_test took |	  2143 
batching_save_with_no_flush_nor_clear_test took |	  2106 
batching_save_with_no_flush_nor_clear_test took |	  2061 
                                                |          
batching_save_with_flush_and_no_clear_test took |	  6551 
batching_save_with_flush_and_no_clear_test took |	  5979 
batching_save_with_flush_and_no_clear_test took |	  6079 
batching_save_with_flush_and_no_clear_test took |	  5985 
batching_save_with_flush_and_no_clear_test took |	  6127 
                                                |          
batching_save_with_flush_and_clear_test took 	|	  2354 
batching_save_with_flush_and_clear_test took 	|	  2340 
batching_save_with_flush_and_clear_test took 	|	  2311 
batching_save_with_flush_and_clear_test took 	|	  2384 
batching_save_with_flush_and_clear_test took 	|	  2599 
                                                |          
save_non_transactional_test took 		        |	  9530 
save_non_transactional_test took 		        |	  5953 
save_non_transactional_test took 		        |	  5764 
save_non_transactional_test took 		        |	  6104 
save_non_transactional_test took 		        |	  5908 
                                                |          
save_with_no_flush_nor_clear_test took 	        |     2155 
save_with_no_flush_nor_clear_test took 	        |     2175 
save_with_no_flush_nor_clear_test took 	        |     2469 
save_with_no_flush_nor_clear_test took 	        |     2463 
save_with_no_flush_nor_clear_test took 	        |     2180 
                                                |             
save_with_flush_and_no_clear_test took 	        |     6105 
save_with_flush_and_no_clear_test took 	        |     5818 
save_with_flush_and_no_clear_test took 	        |     6395 
save_with_flush_and_no_clear_test took 	        |     6480 
save_with_flush_and_no_clear_test took 	        |     6514 
                                                |          
save_with_flush_and_clear_test took 	        |	  2522 
save_with_flush_and_clear_test took 	        |	  2603 
save_with_flush_and_clear_test took 	        |	  2491 
save_with_flush_and_clear_test took 	        |	  2603 
save_with_flush_and_clear_test took 	        |	  2667 