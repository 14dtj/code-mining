# 导入库
import difflib

# 判断相似度的方法，用到了difflib库
def get_equal_rate(str1, str2):
   return difflib.SequenceMatcher(None, str1, str2).quick_ratio()

# 读取标准idioms放到字符串数组中
file = open("idioms.txt")

idioms = []
row = ''

for line in file.readlines():
    line = ''.join(line.split())
    row += line
    if line == '':
        idioms.append(row)
        row = ''

idioms.append(row)
file.close()
# print(idioms)

# 读取result放到字符串数组中
file = open("result.txt", 'r', encoding='UTF-8')

codes = []
row = ''

for line in file.readlines():
    line = ''.join(line.split())
    row += line
    if line == '':
        codes.append(row)
        row = ''

codes.append(row)
file.close()
# print(codes)

# 根据相似度判断code是否在idioms里
result = []
for code in codes:
    for idiom in idioms:
        rate = get_equal_rate(code, idiom)
        if rate > 0.7:
            result.append(code)
            break

# print(result)
# print(len(result))

# 将结果写入文件中
file = r'compare.txt'

with open(file, 'w') as f:
    for res in result:
        f.write(res + '\n\n')

print("Done.")
