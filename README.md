# batch-or-not
simple benchmark how batch_size option affects insert execution time with hibernate


## run
mvn test

execution times will be listed in logs


## test results

TEST NAME (100000 inserts each) [ms]  
    
    T1          T2          T3          T4          T5          |   avarage

batching_save_with_no_flush_nor_clear_test took

    5023        2398        2143        2106        2061        |   2746,2
                                                          
batching_save_with_flush_and_no_clear_test took 
	  
	6551        5979        6079        5985        6127        |   6144,2
                                                         
batching_save_with_flush_and_clear_test took   

    2354        2340        2311        2384        2599        |   2397,6
                                                         
save_non_transactional_test took 	
 
    9530        5953        5764        6104        5908        |   6651,8
                                                          
save_with_no_flush_nor_clear_test took 	             

    2155        2175        2469        2463        2180        |   2288,4
                                                             
save_with_flush_and_no_clear_test took 	             

    6105        5818        6395        6480        6514        |   6262,4
                                                          
save_with_flush_and_clear_test took 	        	  

    2522        2603        2491        2603        2667        |   2577,2