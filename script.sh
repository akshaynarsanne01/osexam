#!/bin/bash
read -p "Enter a file path: " file_path
if [ -f "$file_path" ] && [ -r "$file_path" ]; then
  echo "The file $file_path is readable."
else
  echo "The file $file_path is not readable or does not exist."
fi