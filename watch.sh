fswatch -r src | (while read; do ./tcr.sh; done)