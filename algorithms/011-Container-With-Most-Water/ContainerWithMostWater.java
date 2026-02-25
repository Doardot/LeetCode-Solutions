// Description
/*
You are given an integer array height of length n. 
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
*/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int nPosLeft = 0;
        int nPosRight = height.length - 1;
        int nMaxArea = 0;
        int nHeight, nLength, nArea;

        while (nPosLeft < nPosRight) {
            nHeight = Math.min(height[nPosLeft], height[nPosRight]);
            nLength = nPosRight - nPosLeft;

            nArea = nHeight * nLength;
            nMaxArea = Math.max(nMaxArea, nArea);

            if (height[nPosLeft] < height[nPosRight]) {
                nPosLeft++;
            } else {
                nPosRight--;
            }
        }
        return nMaxArea;
    }
}
