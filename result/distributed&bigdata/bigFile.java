/**
 * 处理大文件，读入，解析，查找结果
 */
    byte[] buffer = new byte[size];
    int number = srcSize/destSize;
    File[] destFiles = new File[number];
    try{
            $in=new FileInputStream($srcFile);

            while(data=$in.read()!=-1){
                $out=hash(data);
                $outFile = new FileOutputStream($out);
                $writeDataToOutFile;
                destFiles[$out] = $outFile;
            }
    }catch(IOException ex){
        $handleException();
    }finally{
        $closeStream();
    }
    List<Object> results = new ArrayList<>();
    for(File file:destFiles){
        $result = $calculate();
        results.add($result);
    }

    $mergetResults(results);

