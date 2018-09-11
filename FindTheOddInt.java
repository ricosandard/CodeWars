
public class FindTheOddInt {

	public static void main(String[] args) {
		
		String str = "497 311 760 273 727 69 408 818 483 732 818 501 708 784 609 375 983 419 136 106 609 750 371 541 73 863 667 368 556 163 539 497 744 967 711 69 329 732 880 730 699 706 57 118 418 72 562 967 73 131 377 730 144 984 526 138 726 683 587 133 781 953 179 669 227 559 600 821 571 396 428 178 819 718 855 388 866 264 782 26 891 373 803 108 191 931 488 612 906 506 138 539 309 143 750 405 415 627 704 917 566 212 190 245 178 476 15 268 383 999 601 270 973 794 431 775 376 756 111 42 891 35 103 457 333 807 95 138 442 977 361 520 323 850 470 17 949 769 418 911 230 118 723 966 967 919 587 420 566 977 307 208 747 377 746 819 261 105 700 855 936 550 869 652 706 683 989 261 246 994 461 329 436 455 781 46 599 404 518 108 592 261 131 111 163 280 672 554 323 972 42 634 917 54 514 199 906 669 424 688 718 672 760 455 451 364 690 590 738 945 984 979 566 495 385 143 795 276 592 801 57 656 116 420 653 264 394 209 891 396 246 474 972 608 50 821 29 137 918 223 723 671 335 0 241 959 670 708 735 417 860 15 868 723 106 453 103 120 245 275 54 803 880 794 29 735 930 863 868 688 771 723 121 746 688 457 735 949 800 599 59 152 396 42 54 130 985 198 500 228 549 457 902 384 5 936 18 103 623 567 833 183 72 18 483 431 276 58 702 789 611 151 807 291 963 825 699 178 456 343 333 945 547 399 454 130 231 775 80 7 417 264 673 702 68 849 298 634 687 730 506 747 209 457 324 288 417 210 324 52 497 306 944 194 116 994 381 109 671 652 404 593 520 359 411 967 975 136 767 179 405 132 918 527 549 305 519 139 408 311 415 183 488 116 385 904 501 495 339 605 612 951 924 541 554 735 991 181 651 428 183 384 725 126 268 453 343 562 757 73 690 526 369 550 382 64 181 590 256 217 983 121 770 415 107 365 651 280 114 126 703 384 558 754 194 989 457 434 164 103 702 41 408 953 977 770 747 587 5 979 587 196 194 52 851 863 789 273 351 680 173 470 436 753 866 930 151 341 763 161 626 412 166 434 80 991 575 332 967 39 365 133 767 592 700 210 421 153 256 738 35 22 341 396 626 789 854 547 808 497 130 139 670 151 136 671 507 747 808 181 519 598 940 791 807 521 361 230 116 259 411 169 498 775 769 973 834 178 857 233 333 324 381 249 521 975 234 795 906 369 529 190 455 191 331 500 984 581 375 456 518 404 73 415 346 571 421 169 989 26 671 198 923 136 803 42 944 598 822 190 228 657 836 801 436 638 57 162 503 800 537 95 994 227 451 338 825 145 318 994 462 775 153 105 984 488 911 744 162 231 991 317 991 838 54 436 836 242 833 404 904 869 567 351 163 183 750 801 107 961 883 855 196 600 163 150 794 69 161 850 550 708 249 454 855 455 789 807 330 996 375 59 46 727 5 311 906 608 797 5 794 335 60 158 22 653 524 854 834 966 712 556 68 208 306 330 117 107 575 546 963 680 571 667 462 853 492 581 554 599 527 234 588 601 605 395 918 836 476 853 996 836 488 462 424 371 801 412 592 107 243 466 223 0 961 611 137 114 359 611 339 492 611 599 145 671 41 732 614 712 359 120 144 708 963 23 126 977 766 784 243 382 132 891 940 332 999 963 789 64 546 376 109 553 566 291 657 614 711 346 368 588 164 17 553 860 833 335 507 194 863 410 462 130 687 791 217 857 989 49 571 725 789 17 547 461 524 111 317 688 732 261 782 60 474 153 620 399 345 855 959 7 298 671 375 627 498 133 150 311 945 338 726 855 940 50 335 288 117 442 181 789 364 307 703 730 384 259 656 851 704 491 902 754 69 466 879 39 702 911 797 838 503 383 417 985 126 241 95 945 462 757 822 491 32 133 537 782 394 529 623 210 373 789 345 270 547 309 967 242 879 95 32 153 395 23 559 919 923 673 179 803 756 419 199 264 58 210 457 519 212 833 111 766 318 462 388 166 331 484 763 408 951 275 750 260 333 359 849 152 233 554 305 931 883 151 911 519 173 138 924 324 49 179 190 782 638 550 17 620 514 875 849 918 558 940 484 753 260 875 57 771 158 410 849";
		String str_arr[] = str.trim().split("\\s+");
		int arr[] = new int[str_arr.length];
		
		for (int i = 0; i < str_arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		
		
		int num = 0;
	    for (int i = 0; i < arr.length; i++) {
	      num ^= arr[i];
	    }

	    System.out.println(num);
	}

}
